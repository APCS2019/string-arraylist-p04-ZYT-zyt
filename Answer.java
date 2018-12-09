// a
public String decodeString(ArrayList<StringPart> parts){
    String temp = "";
    for(StringPart i : parts){
        temp += masterString.substring(i.getStart(),i.getStart() + i.getLength())
    }
    return temp;
}

//b
public ArrayList<StringPart> encodeString(String word){
    ArrayList<StringPart> temp = new ArrayList<StringPart>();
    while(word.length() != 0){
        StringPart part = findPart(word);
        temp.add(part);
        word = word.substring(part.getLength());
    }
    return temp;
}
