package carapp;

public  class User  {
    protected String username;
    protected String password;
    protected String first_name;
    protected String last_name;
    protected String email;
    protected String phone_number;
    protected String gender;

    public User(String username ,String password, String first_name, String last_name, String email, String phone_number, String gender) {
      
        this.username = username;
        this.password=password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.gender = gender;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

   

    
    public String getUsername() {
        return username;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

   

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

   

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getGender() {
        return gender;
    }

  
    
}