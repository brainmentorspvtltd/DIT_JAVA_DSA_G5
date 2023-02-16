// class (Noun)
// e.g Person , Student, Employee, Account, Customer
// ClassName (PascalCase) e.g FullTimeEmployee
// SOLID 
// S - SRP 
// Object - GOD Class (hashCode), toString()
//class Employee extends Object{
    // Encapsulation - Binding Data (Variables )
    // and Methods into a single unit and that unit is called class.
    class Employee{
    // When Object is created then allocate the memory of Instance Variables
    //int id; // default scope (with in the folder/package scope )
    // Data Hiding
    private int id; // private - with in the class scope
    private String name;
    private double salary;
    private String email;
    public int getId() {
        return id;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getJobDesc() {
        return jobDesc;
    }
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    private String phone;
    private String city;
    private String jobDesc;
    private String managerName;
    private String companyName;
    /*
     * Constructor - To initalize the instance variables
        Constructor name is same as class name
        Constructor never return anything
        Constructor call when u create an object
     */
    // {
    //     System.out.println("I am a Init Block and I call before constuctor call");
    //     System.out.println("Id "+id);
    //     System.out.println("Name "+name);
    //     System.out.println("Salary "+salary);
    // }
    // Default Constructor
    Employee(){
        // this is a default constructor (No Args ) and every class has a default constructor (by default)
        // id =1111;
        // name = "No Name";
        // salary = 1111;
        companyName = "Brain Mentors";
        System.out.println("I am a Default Constructor");
    }
    // // Param Constructor
    Employee(int id, String name, double salary){
        this();  // Calling Default Constructor (Constructor Chaining)
        this.id= id;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }
    // @Override
    // public String toString(){
    //     return "Id "+id+ " Name "+name+" Salary "+salary + " Company "+companyName;
    // }

    

    // void Employee(){
    //     System.out.println("I am not a constructor  i am a method");
    // }
    
    public void takeInput(int id, String name  , double salary){
        // id = id; //Local var = Local Var
        // Instance var = local var
        if(id<=0 || salary<0){
            System.out.println("Invalid Id or Invalid Salary ");
            return ; 
        }
        if (name==null){
            System.out.println("Invalid Name ");
            return ;
        }
        
        this.id = id;
        this.name = name;
        this.salary =salary;
        }
    // @Override    
    // public int hashCode(){
    //     return 1;
    // }
    // method camelCase (verbs)
    // public void printEmployee(){
    //     // this - this is a keyword  (Current calling object reference)
    //     System.out.println("Id "+this.id+" Name "+name+" Salary "+salary+" Company Name "+companyName);
    // }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", companyName=" + companyName + "]";
    }
}