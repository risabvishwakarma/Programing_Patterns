package src.BuilderPattern;

public class User {
    private final String name ;
    private final String address;

    private User(UserBuilder userBuilder){
        this.address=userBuilder.address;
        this.name=userBuilder.name;

    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder{
        private  String name ;
        private  String address;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build(){
           return new User(this);

        }
    }


}
