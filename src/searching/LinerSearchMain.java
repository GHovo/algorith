package searching;

public class LinerSearchMain {

    public static void main(String[] args) {
        int index = LinerSearch.linearSearch(new int[]{89, 57, 91, 47, 22, 67, 99}, 67);
        LinerSearch.print(67, index);
    }
}
