// ============================================================================
//
// Copyright (c) 2005-2007, Talend Inc.
//
// This source code has been automatically generated by JasperETL Powered by Talend
// / JobDesigner (CodeGenerator version 2.2.0.qualifier).
// You can find more information about Talend products at www.talend.com.
// You may distribute this code under the terms of the GNU LGPL license
// (http://www.gnu.org/licenses/lgpl.html).
//
// ============================================================================
package org.talend.designer.components.persistent;

import java.util.Arrays;
import java.util.Comparator;

import org.talend.designer.components.persistent.IPersistableHash.KEYS_MANAGEMENT;

import routines.TalendString;
import routines.system.IPersistableLookupRow;
import routines.system.ParserUtils;
import routines.system.TDieException;

/**
 * Job: test Purpose: <br>
 * Description: <br>
 * 
 * @author slanglois@talend.com
 * @version 0_1
 * @status
 */
public class PersistentTest {

    private static final KEYS_MANAGEMENT KEEP_MODE = IPersistableHash.KEYS_MANAGEMENT.KEEP_LAST;

    private static final String NUMBER = "6";

    // create and load default properties
    private static java.util.Properties defaultProps = new java.util.Properties();

    // create application properties with default
    private static class ContextProperties extends java.util.Properties {

        public ContextProperties(java.util.Properties properties) {
            super(properties);
        }

        public ContextProperties() {
            super();
        }
    }

    private static ContextProperties context = new ContextProperties();

    private static final String jobName = "test";

    private static final String projectName = "TUJ";

    public static Integer errorCode = null;

    private static String currentComponent = "";

    private static final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();

    private static final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();

    private static final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();

    private static final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();

    public static final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();

    private static final String pathFolderTest = "/home/amaumont/data/dev/projets/Talend/hashfile/testData/";

    private class TalendException extends Exception {

        private Exception e = null;

        private PersistentTest c = null;

        private TalendException(PersistentTest c, Exception e) {
            this.e = e;
            this.c = c;
        }

        @Override
        public void printStackTrace() {
            if (!(e instanceof TalendException || e instanceof TDieException)) {
                globalMap.put(currentComponent + "_ERROR_MESSAGE", e.getMessage());
                System.err.println("Exception in component " + currentComponent);
            }
            if (!(e instanceof TDieException)) {
                e.printStackTrace();
            }
            if (!(e instanceof TalendException)) {
                try {
                    for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
                        if (m.getName().compareTo(currentComponent + "_error") == 0) {
                            m.invoke(c, new Object[] { e });
                            break;
                        }
                    }

                } catch (java.lang.SecurityException e) {
                    this.e.printStackTrace();
                } catch (java.lang.IllegalArgumentException e) {
                    this.e.printStackTrace();
                } catch (java.lang.IllegalAccessException e) {
                    this.e.printStackTrace();
                } catch (java.lang.reflect.InvocationTargetException e) {
                    this.e.printStackTrace();
                }
            }
        }
    }

    public void tFileInputDelimited_1_error(Exception exception) throws TalendException {
        end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
        tFileInputDelimited_1_onSubJobError(exception);
    }

    public void tJoin_1_error(Exception exception) throws TalendException {
        end_Hash.put("tJoin_1", System.currentTimeMillis());
        tFileInputDelimited_1_onSubJobError(exception);
    }

    public void tLogRow_1_error(Exception exception) throws TalendException {
        end_Hash.put("tLogRow_1", System.currentTimeMillis());
        tFileInputDelimited_1_onSubJobError(exception);
    }

    public void tFileInputDelimited_2_error(Exception exception) throws TalendException {
        end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
        tFileInputDelimited_1_onSubJobError(exception);
    }

    public void tHash_row4_error(Exception exception) throws TalendException {
        end_Hash.put("tHash_row4", System.currentTimeMillis());
        tFileInputDelimited_1_onSubJobError(exception);
    }

    public void tFileInputDelimited_1_onSubJobError(Exception exception) throws TalendException {
    }

    private class Result {

        private static final int DEFAULT_HASHCODE = 1;

        private static final int PRIME = 31;

        private int hashCode = DEFAULT_HASHCODE;

        public boolean hashCodeDirty = true;

        Integer id;

        String time;

        @Override
        public int hashCode() {
            if (this.hashCodeDirty) {
                final int prime = PRIME;
                int result = DEFAULT_HASHCODE;

                result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());

                this.hashCode = result;
                this.hashCodeDirty = false;
            }
            return this.hashCode;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            final Result other = (Result) obj;

            if (this.id == null) {
                if (other.id != null)
                    return false;
            } else if (!this.id.equals(other.id))
                return false;

            return true;
        }

    }

    private class Main {

        private static final int DEFAULT_HASHCODE = 1;

        private static final int PRIME = 31;

        private int hashCode = DEFAULT_HASHCODE;

        public boolean hashCodeDirty = true;

        Integer id;

        @Override
        public int hashCode() {
            if (this.hashCodeDirty) {
                final int prime = PRIME;
                int result = DEFAULT_HASHCODE;

                result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());

                this.hashCode = result;
                this.hashCodeDirty = false;
            }
            return this.hashCode;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            final Main other = (Main) obj;

            if (this.id == null) {
                if (other.id != null)
                    return false;
            } else if (!this.id.equals(other.id))
                return false;

            return true;
        }

    }

    public void tFileInputDelimited_1Process() throws TalendException {
        try {
            tFileInputDelimited_2Process();

            Main row3 = new Main();
            Result row5 = new Result();

            /**
             * [tLogRow_1 begin ] start
             */

            ok_Hash.put("tLogRow_1", false);
            start_Hash.put("tLogRow_1", System.currentTimeMillis());
            currentComponent = "tLogRow_1";

            // /////////////////////

            final String OUTPUT_FIELD_SEPARATOR_tLogRow_1 = "|";
            java.io.PrintStream consoleOut_tLogRow_1 = null;

            int nb_line_tLogRow_1 = 0;

            // /////////////////////

            /**
             * [tLogRow_1 begin ] stop
             */

            /**
             * [tJoin_1 begin ] start
             */

            ok_Hash.put("tJoin_1", false);
            start_Hash.put("tJoin_1", System.currentTimeMillis());
            currentComponent = "tJoin_1";

            final IPersistableHash<Lookup> tHash_tJoin_1 = (IPersistableHash<Lookup>) globalMap.get("tHash_row4");
            tHash_tJoin_1.initGet();

            // class Util_tJoin_1 {
            //
            // Lookup lookupValue = null;
            //
            // Lookup row4HashKey = new Lookup();
            //
            // public boolean isJoined(Main mainRow) {
            // row4HashKey.id = mainRow.id;
            // row4HashKey.hashCodeDirty = true;
            // lookupValue = tHash_tJoin_1.get(row4HashKey);
            // if (lookupValue != null) {
            // return true;
            // }
            // return false;
            // }
            // }
            //
            // Util_tJoin_1 util_tJoin_1 = new Util_tJoin_1();

            int nb_line_tJoin_1 = 0;
            /**
             * [tJoin_1 begin ] stop
             */

            /**
             * [tFileInputDelimited_1 begin ] start
             */

            ok_Hash.put("tFileInputDelimited_1", false);
            start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
            currentComponent = "tFileInputDelimited_1";

            org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(
                    pathFolderTest + "main" + NUMBER + ".txt", "ISO-8859-15", ";", "\n", true, 0, 0, -1, -1);
            while (fid_tFileInputDelimited_1.nextRecord()) {
                row3 = null;
                boolean whetherReject_tFileInputDelimited_1 = false;
                row3 = new Main();
                try {
                    String temp_tFileInputDelimited_1 = "";
                    temp_tFileInputDelimited_1 = fid_tFileInputDelimited_1.get(0);
                    if (temp_tFileInputDelimited_1.length() > 0) {
                        row3.id = ParserUtils.parseTo_Integer(temp_tFileInputDelimited_1);
                    } else {
                        row3.id = null;
                    }

                } catch (Exception e) {
                    whetherReject_tFileInputDelimited_1 = true;
                    System.err.println(e.getMessage());
                    row3 = null;
                }

                /**
                 * [tFileInputDelimited_1 begin ] stop
                 */
                /**
                 * [tFileInputDelimited_1 main ] start
                 */

                currentComponent = "tFileInputDelimited_1";

                /**
                 * [tFileInputDelimited_1 main ] stop
                 */
                // Start of branch "row3"
                if (row3 != null) {

                    /**
                     * [tJoin_1 main ] start
                     */

                    currentComponent = "tJoin_1";
                    Lookup lookup = new Lookup();
                    lookup.id = row3.id;
                    tHash_tJoin_1.lookup(lookup);
                    while (tHash_tJoin_1.hasNext()) {
                        Lookup tempLookup = (Lookup) tHash_tJoin_1.next();
                        row5 = new Result();
                        row5.id = row3.id;
                        row5.time = tempLookup.time;

                        // /////////////////////
                        /**
                         * [tJoin_1 main ] stop
                         */
                        // Start of branch "row5"
                        // if (row5 != null) {
                        /**
                         * [tLogRow_1 main ] start
                         */

                        currentComponent = "tLogRow_1";

                        // /////////////////////

                        StringBuilder strBuffer_tLogRow_1 = new StringBuilder();

                        if (row5.id != null) { //              

                            strBuffer_tLogRow_1.append(String.valueOf(row5.id));

                        } //            

                        strBuffer_tLogRow_1.append(OUTPUT_FIELD_SEPARATOR_tLogRow_1);

                        if (row5.time != null) { //              

                            strBuffer_tLogRow_1.append(String.valueOf(row5.time));

                        } //            

                        // ////

                        if (globalMap.get("tLogRow_CONSOLE") != null) {
                            consoleOut_tLogRow_1 = (java.io.PrintStream) globalMap.get("tLogRow_CONSOLE");
                        } else {
                            consoleOut_tLogRow_1 = new java.io.PrintStream(new java.io.BufferedOutputStream(System.out));
                            globalMap.put("tLogRow_CONSOLE", consoleOut_tLogRow_1);
                        }

                        consoleOut_tLogRow_1.println(strBuffer_tLogRow_1.toString());
                        consoleOut_tLogRow_1.flush();
                        nb_line_tLogRow_1++;
                        // ////

                        // /////////////////////
                        /**
                         * [tLogRow_1 main ] stop
                         */

                    } // End of branch "row5"

                } // End of branch "row3"

                /**
                 * [tFileInputDelimited_1 end ] start
                 */

                currentComponent = "tFileInputDelimited_1";

            }
            fid_tFileInputDelimited_1.close();
            globalMap.put("tFileInputDelimited_1_NB_LINE", fid_tFileInputDelimited_1.getRowNumber());

            ok_Hash.put("tFileInputDelimited_1", true);
            end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());

            /**
             * [tFileInputDelimited_1 end ] stop
             */
            /**
             * [tJoin_1 end ] start
             */

            currentComponent = "tJoin_1";

            ok_Hash.put("tJoin_1", true);
            end_Hash.put("tJoin_1", System.currentTimeMillis());

            /**
             * [tJoin_1 end ] stop
             */
            /**
             * [tLogRow_1 end ] start
             */

            currentComponent = "tLogRow_1";

            // ////
            // ////
            globalMap.put("tLogRow_1_NB_LINE", nb_line_tLogRow_1);

            // /////////////////////

            ok_Hash.put("tLogRow_1", true);
            end_Hash.put("tLogRow_1", System.currentTimeMillis());

            /**
             * [tLogRow_1 end ] stop
             */

        } catch (Exception e) {

            throw new TalendException(this, e);
        }

        finally {
            // free memory for "tJoin_1"
            globalMap.put("tHash_row4", null);
            System.gc();
        }

    }

    private class Lookup implements IPersistableLookupRow<Lookup>, Comparable<Lookup> {

        private static final int DEFAULT_HASHCODE = 1;

        private static final int PRIME = 31;

        private int hashCode = DEFAULT_HASHCODE;

        public boolean hashCodeDirty = true;

        Integer id;

        String time;

        @Override
        public int hashCode() {
            if (this.hashCodeDirty) {
                final int prime = PRIME;
                int result = DEFAULT_HASHCODE;

                result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());

                this.hashCode = result;
                this.hashCodeDirty = false;
            }
            return this.hashCode;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            final Lookup other = (Lookup) obj;

            if (this.id == null) {
                if (other.id != null)
                    return false;
            } else if (!this.id.equals(other.id))
                return false;

            return true;
        }

        /** Start ADDED */

        public byte[] toKeysData() {
            java.io.ByteArrayOutputStream bao = null;
            java.io.DataOutputStream dos = null;
            byte[] result = null;

            try {
                bao = new java.io.ByteArrayOutputStream();
                dos = new java.io.DataOutputStream(bao);
                dos.writeInt(id);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            } finally {
                if (dos != null) {
                    try {
                        dos.close();
                    } catch (java.io.IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            result = bao.toByteArray();
            return result;
        }

        public void loadKeysData(byte[] keysData) {
            java.io.ByteArrayInputStream bai = null;
            java.io.DataInputStream dis = null;

            try {
                bai = new java.io.ByteArrayInputStream(keysData);
                dis = new java.io.DataInputStream(bai);
                id = dis.readInt();

            } catch (java.io.IOException e) {
                e.printStackTrace();
            } finally {
                if (dis != null) {
                    try {
                        dis.close();
                    } catch (java.io.IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

        public byte[] toValuesData() {
            java.io.ByteArrayOutputStream bao = null;
            java.io.DataOutputStream dos = null;
            byte[] result = null;

            try {
                bao = new java.io.ByteArrayOutputStream();
                dos = new java.io.DataOutputStream(bao);
                byte[] bytes = null;
                if (this.time == null) {
                    dos.writeInt(-1);
                } else {
                    bytes = this.time.getBytes();
                    dos.writeInt(bytes.length);
                    dos.write(bytes);
                    System.out.println("############################");
                    System.out.println(this.time + " => " + bytes.length + " + " + 4 + " = " + (bytes.length + 4));
                    System.out.println(Arrays.toString(bytes));
                }

            } catch (java.io.IOException e) {
                e.printStackTrace();
            } finally {
                if (dos != null) {
                    try {
                        dos.close();
                    } catch (java.io.IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            result = bao.toByteArray();
            return result;
        }

        public void loadValuesData(byte[] valuesData) {
            java.io.ByteArrayInputStream bai = null;
            java.io.DataInputStream dis = null;

            try {
                bai = new java.io.ByteArrayInputStream(valuesData);
                dis = new java.io.DataInputStream(bai);
                int length = 0;
                byte[] bytes = null;
                length = dis.readInt();
                if (length == -1) {
                    this.time = null;
                } else {
                    bytes = new byte[length];
                    dis.read(bytes);
                    this.time = new String(bytes);
                }

            } catch (java.io.IOException e) {
                e.printStackTrace();
                System.exit(0);
            } finally {
                if (dis != null) {
                    try {
                        dis.close();
                    } catch (java.io.IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

        public String toString() {
            return "id = " + id + "; time = " + time;
        }

        public int compareTo(Lookup o) {

            return this.id - o.id;
        }

        public void copyDataTo(Lookup other) {
            other.id = this.id;
            other.time = this.time;
        }

        public void copyKeysDataTo(Lookup other) {
            other.id = this.id;
        }

    }

    public void tFileInputDelimited_2Process() throws TalendException {
        try {

            Lookup lookupRow = new Lookup();

            /**
             * [tHash_row4 begin ] start
             */

            ok_Hash.put("tHash_row4", false);
            start_Hash.put("tHash_row4", System.currentTimeMillis());
            currentComponent = "tHash_row4";

            IPersistableHash<Lookup> tHash_row4 = new PersistentSortedHash<Lookup>(KEEP_MODE, pathFolderTest + "container",
                    new IRowCreator<Lookup>() {

                        public Lookup createRowInstance() {
                            return new Lookup();
                        }

                    });

            tHash_row4.initPut();

            globalMap.put("tHash_row4", tHash_row4);

            /**
             * [tHash_row4 begin ] stop
             */

            /**
             * [tFileInputDelimited_2 begin ] start
             */

            ok_Hash.put("tFileInputDelimited_2", false);
            start_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
            currentComponent = "tFileInputDelimited_2";

            org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_2 = new org.talend.fileprocess.FileInputDelimited(
                    pathFolderTest + "/lookup" + NUMBER + ".txt", "ISO-8859-15", ";", "\n", true, 0, 0, -1, -1);
            while (fid_tFileInputDelimited_2.nextRecord()) {
                lookupRow = null;
                lookupRow = null;
                boolean whetherReject_tFileInputDelimited_2 = false;
                lookupRow = new Lookup();
                try {
                    String temp_tFileInputDelimited_2 = "";
                    temp_tFileInputDelimited_2 = fid_tFileInputDelimited_2.get(0);
                    if (temp_tFileInputDelimited_2.length() > 0) {
                        lookupRow.id = ParserUtils.parseTo_Integer(temp_tFileInputDelimited_2);
                    } else {
                        lookupRow.id = null;
                    }
                    lookupRow.time = fid_tFileInputDelimited_2.get(1);

                } catch (Exception e) {
                    whetherReject_tFileInputDelimited_2 = true;
                    System.err.println(e.getMessage());
                    lookupRow = null;
                }

                /**
                 * [tFileInputDelimited_2 begin ] stop
                 */
                /**
                 * [tFileInputDelimited_2 main ] start
                 */

                currentComponent = "tFileInputDelimited_2";

                /**
                 * [tFileInputDelimited_2 main ] stop
                 */
                // Start of branch "row4"
                if (lookupRow != null) {

                    /**
                     * [tHash_row4 main ] start
                     */

                    currentComponent = "tHash_row4";
                    Lookup row4_HashRow = null;
                    row4_HashRow = tHash_row4.getNextFreeRow();
                    row4_HashRow.id = lookupRow.id;
                    row4_HashRow.time = lookupRow.time;
                    tHash_row4.put(row4_HashRow);

                    /**
                     * [tHash_row4 main ] stop
                     */

                } // End of branch "row4"

                /**
                 * [tFileInputDelimited_2 end ] start
                 */

                currentComponent = "tFileInputDelimited_2";

            }
            fid_tFileInputDelimited_2.close();
            globalMap.put("tFileInputDelimited_2_NB_LINE", fid_tFileInputDelimited_2.getRowNumber());

            ok_Hash.put("tFileInputDelimited_2", true);
            end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());

            /**
             * [tFileInputDelimited_2 end ] stop
             */
            /**
             * [tHash_row4 end ] start
             */

            currentComponent = "tHash_row4";

            tHash_row4.endPut();
            ok_Hash.put("tHash_row4", true);
            end_Hash.put("tHash_row4", System.currentTimeMillis());

            /**
             * [tHash_row4 end ] stop
             */

        } catch (Exception e) {

            throw new TalendException(this, e);
        }

    }

    public static boolean watch = false;

    public static int portStats = 3334;

    public static int portTraces = 4334;

    public static String clientHost;

    public static String defaultClientHost = "localhost";

    public static String contextStr = "Default";

    public static String pid = "0";

    public static String rootPid = null;

    public static String fatherPid = null;

    private static java.util.Properties context_param = new java.util.Properties();

    public static String status = "";

    public static void main(String[] args) {

        int exitCode = runJobInTOS(args);

        globalBuffer.clear();

        System.exit(exitCode);
    }

    public static String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        globalBuffer.clear();

        return bufferValue;
    }

    public static synchronized int runJobInTOS(String[] args) {

        init();

        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }

        if (clientHost == null) {
            clientHost = defaultClientHost;
        }

        pid = TalendString.getAsciiRandomString(6);
        if (rootPid == null) {
            rootPid = pid;
        }
        if (fatherPid == null) {
            fatherPid = pid;
        }

        try {
            java.io.InputStream inContext = PersistentTest.class.getClassLoader().getResourceAsStream(
                    "tuj/test/contexts/Default.properties");
            if (inContext != null) {
                defaultProps.load(inContext);
                inContext.close();
                context = new ContextProperties(defaultProps);
            }

            if (contextStr.compareTo("Default") != 0) {
                inContext = PersistentTest.class.getClassLoader().getResourceAsStream(
                        "tuj/test/contexts/" + contextStr + ".properties");
                if (inContext != null) {
                    context.load(inContext);
                    inContext.close();
                }
            }

            if (!context_param.isEmpty()) {
                context.putAll(context_param);
            }

        } catch (java.io.IOException ie) {
            System.err.println("Could not load context " + contextStr);
            ie.printStackTrace();
        }

        long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long endUsedMemory = 0;
        long end = 0;
        long start = System.currentTimeMillis();
        final PersistentTest testClass = new PersistentTest();
        try {
            errorCode = null;
            testClass.tFileInputDelimited_1Process();
            status = "end";
        } catch (TalendException e_tFileInputDelimited_1) {
            status = "failure";
            e_tFileInputDelimited_1.printStackTrace();

        } finally {
        }
        end = System.currentTimeMillis();
        if (watch) {
            System.out.println((end - start) + " milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : test");
        }

        reset();

        if (errorCode == null) {
            return status != null && status.equals("failure") ? 1 : 0;
        } else {
            return errorCode.intValue();
        }
    }

    public static void evalParam(String arg) {
        if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            portStats = Integer.parseInt(arg.substring(12));
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1));
            }
        }

    }

    private static void init() {
        errorCode = null;
        status = "";
    }

    private static void reset() {

        defaultProps.clear();
        context.clear();
        currentComponent = "";
        start_Hash.clear();
        end_Hash.clear();
        ok_Hash.clear();
        globalMap.clear();
        watch = false;
        portStats = 3334;
        portTraces = 4334;
        clientHost = null;
        defaultClientHost = "localhost";
        contextStr = "Default";
        pid = "0";
        rootPid = null;
        fatherPid = null;
        context_param.clear();
        System.gc();
    }
}
/***********************************************************************************************************************
 * 23006 characters generated by Talend OpenStudio on the 2008��3��31�� ����11ʱ12��32��
 **********************************************************************************************************************/
