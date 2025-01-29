package singlylinkedlist.socialmediafriendconnections;

import java.util.HashSet;
import java.util.Set;

class SocialMedia {
    private User head = null;

    public void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    public void addFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null && userID1 != userID2) {
            if (!user1.friendIDs.contains(userID2)) {
                user1.friendIDs.add(userID2);
                user2.friendIDs.add(userID1);
                System.out.println("Friend connection added between " + userID1 + " and " + userID2);
            }
        }
    }

    public void removeFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            user1.friendIDs.remove(Integer.valueOf(userID2));
            user2.friendIDs.remove(Integer.valueOf(userID1));
            System.out.println("Friend connection removed between " + userID1 + " and " + userID2);
        }
    }

    public void findMutualFriends(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);
        if (user1 != null && user2 != null) {
            Set<Integer> mutualFriends = new HashSet<>(user1.friendIDs);
            mutualFriends.retainAll(user2.friendIDs);
            System.out.println("Mutual Friends of " + userID1 + " and " + userID2 + ": " + mutualFriends);
        }
    }

    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.println("Friends of " + userID + ": " + user.friendIDs);
        }
    }

    public User findUserByID(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) return temp;
            temp = temp.next;
        }
        return null;
    }

    public User findUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void countFriends(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.println("User " + userID + " has " + user.friendIDs.size() + " friends.");
        }
    }
}