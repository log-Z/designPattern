package structure.adapterPattern.classAdapter;

class PowerAdapter extends DCPower implements ACPower {

    public void outputAC5V(float amp) {
        outputDC220V(amp * 5 / 220);
        System.out.println("[AC] voltage = 5V, current = " + amp + "A");
    }

}
