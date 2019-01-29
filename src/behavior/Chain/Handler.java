package behavior.Chain;

public abstract class Handler {
    /**
     * 持有后继的责任对象
     */
    protected Handler successor;
    public abstract void handleRequest();

    /**
     * 取值方法
     * **/
    public Handler getSuccessor(){
        return successor;
    }
    /***
     * 赋值方法,设置后继的责任对象
     * */
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }
}
