package lesson10;

public record RecordLauncher() {
    public static void main(String[] args) {
        PrinterRecord printerRecord=new PrinterRecord("","");
        printerRecord.text();
        printerRecord.source();
    }
}
