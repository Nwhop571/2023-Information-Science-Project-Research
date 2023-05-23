package kr.ishs.iscience;

public class NewAsusNotebook extends Notebook implements UsbA, UsbC{
    @Override
    public String shapeA() {
        return "rectangle shape interface";
    }
    @Override
    public String shapeC() {
        return "rounded shape interface";
    }
}
