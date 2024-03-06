import java.util.List;

public interface ListConvertor {

    String listToString(List<String> list);
}

class Strategy1 implements ListConvertor {

    @Override
    public String listToString(List<String> list) {
        String result = "";
        for (String s : list) {
            result += s + "\n";
        }
        return result;
    }

}


class Strategy2 implements ListConvertor {

    @Override
    public String listToString(List<String> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
            if (i % 2 == 1) {
                result += "\n";
            }
        }
        return result;
    }

    
}

class Strategy3 implements ListConvertor {

    @Override
    public String listToString(List<String> list) {
        String result = "";
        for (int i =0; i < list.size(); i++){
            result += list.get(i);
            if ((i+1) % 3 == 0) {
                result += "\n";
            }
        }
        return result;
    }

    
}