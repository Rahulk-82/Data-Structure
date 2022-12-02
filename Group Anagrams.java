class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){         
            int []count=new int[26];
            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
                
            }
            StringBuffer sb=new StringBuffer();
            for(int x:count){
                sb.append(x);
                sb.append("#");
            }
            String r=sb.toString();
            if(map.containsKey(r)){
                List<String>st=map.get(r);
                st.add(s);
                map.put(r,st);
            }
            else{
                List<String> string1=new ArrayList<>();
                string1.add(s);
                map.put(r,string1);
            }
        }
        List<List<String>> string2=new ArrayList<>();
        for(List<String> string1:map.values()){
            string2.add(string1);
        }
        return string2;
        
    }
}