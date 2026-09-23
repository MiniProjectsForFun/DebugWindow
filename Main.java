public class Main {

    public static void main(String[] args) {
        DebugWindow.addLog("test");
        for (int i = 0; i < 10000; i++) {
            DebugWindow.addLog("Log message " + (i + 1));
        }
    }
}