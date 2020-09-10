/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
class User {
    private int rank,marks;
    private String firstname,lastname,email;
    public User(int rank,String firstname,String lastname,String email,int marks){
    this.rank=rank;
    this.marks=marks;
    this.firstname=firstname;
    this.lastname=lastname;
    this.email=email;
}
    public int getrank(){
        return rank;
    }
    
     public int getmarks(){
        return marks;
    }
     
     public String getfirstname(){
         return firstname;
     }
     public String getlastname(){
         return lastname;
     }
     public String getemail(){
         return email;
     }
}
