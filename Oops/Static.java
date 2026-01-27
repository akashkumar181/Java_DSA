package Oops;
public class Static {
    public static void main(String[] args) {

        // static = Modifies a variable or method belong to the class,
        //               rather than to any specific object.
        //               Commonly used for utility methods or shared resources.

        Friendd friend1 = new Friendd("Spongebob");
        Friendd friend2 = new Friendd("Patrick");
        Friendd friend3 = new Friendd("Squidward");
        Friendd friend4 = new Friendd("Sandy");

        Friendd.showFriends();
    }
}

class Friendd {

    static int numOfFriends;
    String name;

    Friendd(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }
}