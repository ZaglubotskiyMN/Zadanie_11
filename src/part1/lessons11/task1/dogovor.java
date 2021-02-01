package part1.lessons11.task1;

class dogovor extends documents {
    private int number;
    private String type;
    private String info;
    dogovor(int number,String type,String info) {
        super();
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
