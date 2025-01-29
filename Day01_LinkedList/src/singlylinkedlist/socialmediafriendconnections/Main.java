package singlylinkedlist.socialmediafriendconnections;

public class Main {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 24);
        sm.addUser(3, "Charlie", 26);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.displayFriends(1);
        sm.displayFriends(2);
        sm.findMutualFriends(2, 3);
        sm.removeFriend(1, 2);
        sm.countFriends(1);
    }
}
