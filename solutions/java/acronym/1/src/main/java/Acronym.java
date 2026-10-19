class Acronym {

    String  phrase=null;
    Acronym(String phrase) {
        this.phrase=phrase;
    }

    String get() {
        
        StringBuilder sb = new StringBuilder();
        for (String retval: phrase.split("[\\s_-]+")){
            char a =retval.charAt(0);
            sb.append(Character.toUpperCase(a));
        }
        return sb.toString();
    }

}
