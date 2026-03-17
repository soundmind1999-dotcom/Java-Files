
public class VowelConsonant{
    public static String VowelAndConsonant (String character){

    for (int count = 0; count <= character.length(); count++){

    char letter = character.charAt(count);

    if (letter = "a" || letter = "A" || letter = "e" || letter = "E" || letter = "i" || letter = "I" || letter = "o" || letter = "O" || letter = "u" || letter = "U"){

    vowelCount++;
    return vowelCount;
}
    else{
    consonantCount++;
}
    return consonantCount;

}
    


  }
}



