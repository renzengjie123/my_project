package lambda;

import projecct.text.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        new Test();
        StreamTest t = new StreamTest();
        //t.addOperation();
        //t.findMax();
        //t.getArtistInfo();
        //t.getListData();
        //t.albumFlatMap();
        System.out.println(String.format("%.4f", 1.1));

    }

    /**
     * reduce操作
     * 使用Lambda表达式和stream的reduce操作对int数组进行求和操作。
     */
    private void addOperation() {
        Integer[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        //1. 将数组转换为列表。
        int sum = Arrays.asList(list)
                //2. 使用列表的stream方法获取stream流。
                .stream()
                //3. 使用stream的reduce函数遍历列表对象，并将对象相加。
                //Lambda表达式“(x, y) -> x + y”为累加器。
                .reduce(0, (x, y) -> x + y);
        System.out.println("sum : " + sum);
    }

    /**
     * max操作
     * 使用stream的max操作求数组中的最大值。
     */
    private void findMax() {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int max = Arrays.asList(array)
                .stream()//生成stream
                .max((x, y) -> x - y)//及早求值运算，获取最大值
                .get();//获取int值
        System.out.println("max : " + max);
    }

    class Artist {
        private String name;
        private String nation;

        private Artist(String name, String nation) {
            this.name = name;
            this.nation = nation;
        }
    }

    /**
     * map操作
     * 接受艺术家列表作为参数,返回一个字符串列表,其中包含艺术家的 姓名和国籍
     */
    private void getArtistInfo() {
        Artist[] array = { new Artist("Bob", "China"), new Artist("Tom", "USA"), new Artist("Jerry", "Japan"),
                new Artist("Tony", "England"), new Artist("Kitty", "China"), };
        List<String> artistInfo = Arrays.asList(array)
                .stream()//生成stream
                .map(artist -> artist.name + "-" + artist.nation)//对stream里面的元素进行映射
                .collect(Collectors.toList());//重新生成集合
        System.out.println("artistInfo : " + artistInfo);
    }

    class Album {
        String name;
        int length;

        public Album(String name, int length) {
            this.name = name;
            this.length = length;
        }
    }

    /**
     * filter操作
     * 接受专辑列表作为参数,返回一个由最多包含 3 首歌曲的专辑组成的列表。
     */
    private void albumFilter() {
        Album[] array = { new Album("aa", 3), new Album("bb", 5), new Album("cc", 6),
                new Album("dd", 2), new Album("ee", 1) };
        List<Album> list = Arrays.asList(array)
                .stream()//生成stream
                .filter(album -> album.length <= 3)//根据条件对元素进行过滤
                .collect(Collectors.toList());//重新生成集合
        //生成stream并进行遍历
        //list.stream().forEach(item -> System.out.print(item.name + " "));
        List data = new ArrayList();
        list.stream().forEach(item -> {if(item.name.equals("aa")) data.add(item.name);});
        data.stream().forEach(item -> System.out.print(item));
        System.out.println();
    }

    /**
     * flatMap操作
     * 接受专辑列表作为参数,返回一个由最多包含 3 首歌曲的专辑组成的列表。
     */
    private void albumFlatMap() {
        Album[] array1 = { new Album("aa", 3), new Album("bb", 5), new Album("cc", 6) };
        Album[] array2 = { new Album("dd", 2), new Album("ee", 1) };

        //1. 生成包含所有元素的一个stream流。
        List<String> list = Stream.of(array1, array2)
                //Stream的flatMap方法可以将二维的数组或者列表扁平化，并将扁平化的数组或者列表转换为stream。
                //2. 通过第一个操作生成的stream流，将每个数组元素转换为stream流，这里会调用两次
                //albums的操作，对应两个Album数组。
                .flatMap(albums -> Arrays.asList(albums).stream())
                //3. 通过map函数对每个生成的stream的所有Album元素进行映射。
                .map(item -> item.name + "-" + item.length)
                //4. 重新生成集合。
                .collect(Collectors.toList());
        //需要注意的是对于2～4步，每一个Album数组都会单独走一遍，并且是按照第一步数组排列顺序进行的。
        list.stream().forEach(album -> System.out.print(album + " "));
        System.out.println();
    }

    private void getListData(){
        List<String> list = new ArrayList<>();
        list.add("a.1");
        list.add("a.2");
        list.add("b.3");
        list.add("b.4");
        list.add("5");
        for (String str : list) {
            String str1 = str;
            String[] split = str1.split("\\.");
            if(split.length > 1){
                str = "coalesce(" + str + ",'')" + " AS " + split[split.length - 1];
            }else{
                str = "coalesce(" + str + ",'')" + " AS " + str;
            }
            System.out.println(str);
        }
        /*List<String> list1 = list.stream().map(x -> x = "coalesce(" + x + ",'')" + " AS " + x).collect(Collectors.toList());
        list1.stream().forEach(album -> System.out.println(album + " "));*/
    }

    public void lenStream() {
        List<String> list = Arrays.asList("java", "scala", "python", "shell", "ruby");
        long num = list.parallelStream().filter(x -> x.length() < 5).count();
        System.out.println(num);
    }

    public void numberStreamConstruct() {
        IntStream.of(new int[] {1, 2, 3}).forEach(System.out::println);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
    }

    public void turnUpperCase() {
        List<String> list = Arrays.asList(new String[] {"a", "b", "c"});
        List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        result.forEach(x -> System.out.print(x + " "));
    }

    public void distinctStream() {
        Stream<String> distinctStream = Stream.of("bj","shanghai","tianjin","bj","shanghai").distinct();
        Stream<String> sortedStream = distinctStream.sorted(Comparator.comparing(String::length));
        sortedStream.forEach(x -> System.out.print(x + " "));
    }

    public void sortStream() {
        Stream<Integer> sortedStream = Stream.of(1,3,7,4,5,8,6,2).sorted();
        sortedStream.collect(Collectors.toList()).forEach(x -> System.out.print(x + " "));
        System.out.println();
        Stream<Integer> sortedReverseStream = Stream.of(1,3,7,4,5,8,6,2).sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Stream<Integer> sortedReverseStreamV2 = Stream.of(1,3,7,4,5,8,6,2).sorted((Integer o1, Integer o2) -> o2 - o1);
        sortedReverseStreamV2.collect(Collectors.toList()).forEach(x -> System.out.print(x + " "));
    }

    public void reductionStream() {
        Stream<String> wordList = Stream.of("bj","tj","sh","yy","yq").distinct();
        Optional<String> firstWord = wordList.filter(word -> word.startsWith("y")).findFirst();
        System.out.println(firstWord.orElse("unknown"));
    }

    public void reduceTest() {
        Stream<Integer> list = Stream.of(1,2,3,4,5);
        Optional<Integer> result = list.reduce((x, y) -> x + y);
        System.out.println(result);
    }

    public void collectTest() {
        List<String> list = Stream.of("hello", "world", "hello", "java").collect(Collectors.toList());
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();
        Set<String> set = Stream.of("hello", "world", "hello", "java").collect(Collectors.toSet());
        set.forEach(x -> System.out.print(x + " "));
        System.out.println();
        Set<String> treeset = Stream.of("hello", "world", "hello", "java").collect(Collectors.toCollection(TreeSet::new));
        treeset.forEach(x -> System.out.print(x + " "));
        System.out.println();
        String resultStr = Stream.of("hello", "world", "hello", "java").collect(Collectors.joining(","));
        System.out.println(resultStr);
    }


}
