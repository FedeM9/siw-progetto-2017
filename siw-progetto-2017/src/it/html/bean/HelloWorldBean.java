package it.html.bean;
 
public class HelloWorldBean {
 
    private String messaggio = "Ciao Mondo!";
 
    public HelloWorldBean() {}
 
    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }
 
    public String getMessaggio() {
        return this.messaggio;
    }
    
}