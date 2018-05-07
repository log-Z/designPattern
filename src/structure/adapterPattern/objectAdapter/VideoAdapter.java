package structure.adapterPattern.objectAdapter;

public class VideoAdapter implements VGA {

    private HDMI hdmi;

    VideoAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public String output() {
        if (hdmi == null) {
            return null;
        }
        byte[] data = hdmi.output();
        return new String(data);
    }

}
