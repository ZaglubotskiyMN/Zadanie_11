package part1.lessons11.task1;

class dogovor  {
    private int number;
    private String type;
    private Object info;
    dogovor(int number,String type,Object info) {
        this.setNumber(number);
        this.setType(type);
        this.setInfo(info);
    }




    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public String toString() {
        return this.number + ","  + this.type + ","  + this.info;
    }
}
