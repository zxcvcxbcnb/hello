class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {
            char dna = dnaStrand.charAt(i);

            switch (dna) {
                case 'G':
                    rna.append('C');
                    break;
                case 'C':
                    rna.append('G');
                    break;
                case 'T':
                    rna.append('A');
                    break;
                case 'A':
                    rna.append('U');
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Invalid DNA character: " + dna
                    );
            }
        }

        return rna.toString();
    }

}
