class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator==0){
return "0";
}
        StringBuffer sb=new StringBuffer();
if((numerator>0 && denominator<0)||(numerator<0&& denominator>0))
{
sb.append('-');
}

long devisor=Math.abs((long)numerator);
long divident=Math.abs((long)denominator);
long remainder=devisor%divident;
sb.append(devisor/divident);
if(remainder==0){
return sb.toString();
} 
sb.append(".");

Map<Long,Integer> map=new HashMap<>();
while(remainder!=0){
if (map.containsKey(remainder)){
sb.insert(map.get(remainder),"(");
sb.append(")");
break;
}
map.put(remainder,sb.length());
remainder*=10;
sb.append(remainder/divident);
remainder=(remainder%divident);


}
return sb.toString();
        
    }
}