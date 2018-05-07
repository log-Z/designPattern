package structure.flyweightPattern;

import structure.flyweightPattern.flyweight.*;

/**
 * 设计模式 - 享元
 *
 * 意图：    运用共享技术有效地支持大量细粒度的对象
 * 使用案例：共享可重复使用的特征对象（即享元），使特征对象尽可能少的产生。
 *           一般来说，在持有享元的实体对象中，享元应该是几乎不发生变化的。
 * 备注：    享元工厂用于管理享元的，享元工厂内部可以缓存之前已经构建过的享元以便下次直接调用（共享的关键）。
 *           但随着享元的数量增多，可能导致内存紧张，因此享元工厂应该具备垃圾清理机制，以及时清理不常用的享元。
 */
public class Client {

    public static void main(String[] args) {
        boolean isContain;
        ComputerFlyweightFactory factory = ComputerFlyweightFactory.getInstance();

        // 获取享元
        GPUFlyweight gpu1 = (GPUFlyweight) factory.getGPUFlyweight(
                GPUFlyweight.MODEL_AMD_RX_VEGA, GPUFlyweight.VERSION_REFERENCE_DESIGN
        );
        GPUFlyweight gpu2 = (GPUFlyweight) factory.getGPUFlyweight(
                GPUFlyweight.MODEL_NVIDIA_TITAN_V, GPUFlyweight.VERSION_NON_REFERENCE_DESIGN
        );
        MotherboardFlyweight motherboard1 = (MotherboardFlyweight) factory.getMotherboardFlyweight(
                MotherboardFlyweight.MODEL_1
        );
        MotherboardFlyweight motherboard2 = (MotherboardFlyweight) factory.getMotherboardFlyweight(
                MotherboardFlyweight.MODEL_2
        );

        // 测试电脑1（使用单个组合）
        Computer computer11 = new Computer(gpu1, motherboard1);
        isContain = computer11.contain(GPUFlyweight.MODEL_AMD_RX_VEGA, GPUFlyweight.VERSION_REFERENCE_DESIGN);
        System.out.println(isContain);

        // 测试电脑2（使用单个组合）
        Computer computer22 = new Computer(gpu2, motherboard2);
        isContain = computer22.contain(GPUFlyweight.MODEL_AMD_RX_VEGA, GPUFlyweight.VERSION_NON_REFERENCE_DESIGN);
        System.out.println(isContain);

        // 构建享元组合
        ComputerFlyweight computerFlyweight2 = new CollectionFlyweight();
        computerFlyweight2.add(gpu1);
        computerFlyweight2.add(motherboard2);

        // 测试电脑2（使用享元组合）
        Computer computer12 = new Computer(gpu1, motherboard2);
        isContain = computer12.contain(GPUFlyweight.MODEL_AMD_RX_VEGA, GPUFlyweight.VERSION_REFERENCE_DESIGN);
        System.out.println(isContain);
        isContain = computer12.contain(MotherboardFlyweight.MODEL_2, null);
        System.out.println(isContain);

    }

}
