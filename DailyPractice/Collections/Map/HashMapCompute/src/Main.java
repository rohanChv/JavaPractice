import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> stock=new HashMap<>();
        stock.put("biscuits",1);
        stock.put("boke",5);
        stock.put("maza",10);
        stock.put("pepsi",30);
        stock.put("fanta",40);
        Scanner sc=new Scanner(System.in);
        String s="Hala LULU";
        StringTokenizer st=new StringTokenizer(s);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        char[] array=s.toLowerCase().toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char x:array){
            map.put(x,(map.getOrDefault(x,0))+1);
        }

        System.out.println(map);
        List<Map.Entry<Character,Integer>> lis1=new ArrayList<>(map.entrySet());
        lis1.sort(Map.Entry.comparingByValue((Integer a,Integer b)->b.compareTo(a)));
        System.out.println(lis1);
        Map.Entry<Character,Integer> ent=lis1.get(0);
        System.out.println(ent.getValue());
        while (true){
            System.out.println("Enter the Option from below items");
            System.out.println("Available items");
            stock.keySet().forEach(System.out::println);
            String option=sc.next();

            switch (option){
                case "biscuits":stock.compute(option,(k,v)-> v-1);
                break;
                case "maza":stock.computeIfPresent(option,(k,v)->v-1);
                System.out.println("Current stock of "+option +stock.get(option));
                break;
                case "refill_stock": System.out.println("Enter Item");
                    String item=sc.next();
                    System.out.println("Enter Quantity");
                    int q=sc.nextInt();
                    stock.putIfAbsent(item,q);
                    continue;
            }
            if (stock.get(option)==0){
                stock.remove(option);
            }
        }

    }
}