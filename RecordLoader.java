package a3;

import java.util.*;

interface RecordLoader {
    public List<Record> load(String filename) throws Exception;
}
