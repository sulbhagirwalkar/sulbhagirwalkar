package com.streamExamples;

public class Payee {
    public int id;
    public String name;
    public String email;
    Payee(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
        }
        public  int getId(){
        return id;
        }
        public String getName(){
        return name;
        }
        public void setName(String name){
        this.name = name;
        }
public String toString(){
        return "Payee {" +
            "id" + id + '\''+
            ", name=" + name + '\''+
            ", email=" + email + '}';
         }

    }

