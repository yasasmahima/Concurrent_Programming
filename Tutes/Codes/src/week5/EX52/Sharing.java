package week5.EX52;

/**
 * This is Sharing Class which used to execute the Reader and Writer
 */
public class Sharing {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        SharedVariable variable1 = new SharedVariable();
        SharedVariable variable2 = new SharedVariable();

        /**
         * Asnwers for Ex - 5.6 and 5.7 Todo - Uncomment to check (Have to update the Writer and Reader class as well)
         */
//        Reader reader1Thread = new Reader("Reader-1",variable1,10);
//        Writer writer1Thread = new Writer("Writer-1",variable1,0,10);
//
//        writer1Thread.start();
//        reader1Thread.start();

        /**
         * Answers for Ex - 5.7 Todo- Uncomment to check (Have to update the Writer and Reader class as well)
         */
//        Reader reader2Thread = new Reader("Reader-2",variable1,10);
//        Writer writer2Thread = new Writer("Writer-2",variable1,10,20);
//
//        writer2Thread.start();
//        reader2Thread.start();

        /**
         * Answers for Ex - 5.8
         */
        Reader reader1Thread = new Reader("Reader-1",variable1,variable2,5);
        reader1Thread.start();

        Writer writer1Thread = new Writer("Writer-1", variable1,variable2, 0, 5);
        writer1Thread.start();

        Reader reader2Thread = new Reader("Reader-2",variable1,variable2,5);
        reader2Thread.start();

        Writer writer2Thread = new Writer("Writer-2", variable1,variable2, 5, 10);
        writer2Thread.start();

    }

}
