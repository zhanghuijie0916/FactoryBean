package dutyChainMode.request;

public abstract class IRequest {
    private String name;
    private String requestDescribe;

    public IRequest(String name,String requestDescribe){
        this.name = name;
        this.requestDescribe = requestDescribe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequestDescribe() {
        return requestDescribe;
    }

    public void setRequestDescribe(String requestDescribe) {
        this.requestDescribe = requestDescribe;
    }

    @Override
    public String toString() {
        return "请求：" +
                "name='" + name + '\'' +
                ", requestDescribe='" + requestDescribe + '\'';
    }
}
