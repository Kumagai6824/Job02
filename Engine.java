public class Engine {
    //Field
    private final String carName; //車種名
    private final int cc; //排気量
    private final EnType type; //enumより


    //複数コンストラクターを設定することもできる
    public Engine(String name,int cc, EnType type){
        this.carName =name;
        this.cc =cc;
        this.type= type;
    }

    public String getCarName() {
        return carName;
    }

    public int getCc() {
        return cc;
    }

    public String getType() {
        return type.getType();
    }

    public void dispName(){
        System.out.println("["+ getCarName()+"]");
    }

    public void dispEngine(){
        System.out.println("["+ getCarName()+"]"+"\r\n\sCC:"+ getCc()+"\r\n\sEngineType:"+getType());

    }
}

