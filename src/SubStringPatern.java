public class SubStringPatern {
    public boolean repeatedSubstringPattern(String s) {
        int leng = s.length(); // pega o tamanho da string exemplo abab 4
        for ( int i = leng/2; i >= 1; i--){
            // i é tamanho 4/2 e se for maior do que 1 ou igual roda pra ver se é true já q não se poderia repetir se tivesse numero impar
            if( leng % i == 0){
                // Verifica se o numero é divisivel
                int numb_repeats = leng/i; // quantidade de vezes que vai ser necessaria pra pegar a string completa
                String substring =  s.substring(0,i); // adiciona substring até a metade que é i
                StringBuilder sb =  new StringBuilder();
                // repete adicionando cada string até chegr na sua totalidade
                for ( int j = 0 ; j < numb_repeats; j++){
                    sb.append(substring);
                }
                // e por fim compara se a string construida é igual a inicial e se for retorna verdadeiro
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
