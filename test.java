public class test {
    public static void main(String[] args) {
        LinearProbingHashMap<Integer,String> map = new LinearProbingHashMap<>();
        map.put(1,"hello");
        map.put(2,"hello");
        map.put(4,"hi");
        map.put(5,"name");
        map.put(7,"is");
        map.put(8,"ari");
        map.put(9,"hell");
        map.put(10,"hello");
        map.put(11,"hello");
        System.out.println(map);

    }
}
