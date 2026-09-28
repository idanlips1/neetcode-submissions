static class Singleton {
        private static volatile Singleton unique = null;
        private String mode;
    private Singleton() {
        this.mode = "Active";
    }

    public static Singleton getInstance() {
        if (unique == null){
            synchronized (Singleton.class){
                if (unique == null){
                    unique = new Singleton();
                }
            }
        }
        return unique;
    }

    public String getValue() {
        return this.mode;
    }

    public void setValue(String value) {
        this.mode = value;
    }
    
}
