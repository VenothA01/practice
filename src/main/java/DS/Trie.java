package DS;

public class Trie {

int ALPHA_SIZE = 26;
boolean isEndOfWord ;
Trie[] arr;

public Trie(){
    isEndOfWord = false;
    arr = new Trie[ALPHA_SIZE];
    for(int i=0;i<ALPHA_SIZE;i++){
        arr[i]=null;
    }
}

public void insert(String word){
    System.out.println("Inserting \"" + word + "\"");
    int level = 0;
    int length = word.length();
    int index;

    Trie curr = this;

    for(level=0;level<length;level++){
        index = word.charAt(level)-'a';
        if(curr.arr[index]==null){
            curr.arr[index] = new Trie();
        }
        curr = curr.arr[index];
    }

    curr.isEndOfWord=true;
}

public boolean search(String key){
    System.out.println("Searching \"" + key + "\"");
    int level = 0;
    int length = key.length();
    int index;

    Trie curr = this;

    for (int i=0;i<key.length();i++){
        index = key.charAt(i)-'a';
        if(curr.arr[index]==null){
            return  false;
        }
        curr = curr.arr[index];
    }

    return curr!=null && curr.isEndOfWord;
}

public boolean startsWith(String prefix){
    System.out.println("Searching prefix\"" + prefix + "\"");
    int level = 0;
    int length = prefix.length();
    int index;

    Trie current = this;

    for(level=0;level<length;level++){
        index = prefix.charAt(level)-'a';
        if(current.arr[index]==null){
            return false;
        }
        current = current.arr[index];
    }

    return current!=null;
}


    public static void main(String args[]){

        Trie head = new Trie();
        head.insert("apple");
        System.out.println(head.search("apple"));
        System.out.println(head.search("app"));
        System.out.println(head.startsWith("app"));
        System.out.println(head.startsWith("appd"));

    }

}
