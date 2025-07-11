public class Person {
    int id;
    String name;
    String surName;
    String Job;

    @Override
    public String toString() {
        return  "{\n"+
                "\"id\""+":"+"\""+ id+"\"," +"\n"+
                "\"name\""+":" +"\""+ name + "\"," +"\n"+
                "\"surName\""+":" +"\""+ surName + "\"," +"\n"+
                "\"Job\""+":"+"\""+ Job + "\"" +"\n"+
                "},";
    }

    public Person(int id, String name, String surName, String job) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        Job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }
}
