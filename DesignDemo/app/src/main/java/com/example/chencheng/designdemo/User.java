package com.example.chencheng.designdemo;

/**
 * Created by chencheng on 16/12/21.
 */
public class User {


    /**
     * id : 2528362
     * wx_name : 企微商
     * wx_id : wangchcgx111
     * raw_id : gh_f82fcf84d483
     * qrcode_url : http://open.weixin.qq.com/qr/code/?username=wangchcgx111
     * fans_num : 3157
     * fans_num_int : 3157
     * idx1_read_num : {"min":0,"max":0}
     * idx2_read_num : {"min":0,"max":0}
     * idx3_read_num : {"min":0,"max":0}
     * idx4_read_num : {"min":0,"max":0}
     * idx5_read_num : {"min":0,"max":0}
     * idx6_read_num : {"min":0,"max":0}
     * idx7_read_num : {"min":0,"max":0}
     * idx8_read_num : {"min":0,"max":0}
     * status : 0
     * status_name : 未接单
     * source : manual
     * source_name : 手动添加
     * is_sync : 0
     * last_bring_time : 0
     * distance_last_bring_time : 0
     * is_have_plan : 0
     * is_updated : 1
     */

    private String id;
    private String wx_name;
    private String wx_id;
    private String raw_id;
    private String qrcode_url;
    private String fans_num;
    private String fans_num_int;
    /**
     * min : 0
     * max : 0
     */

    private Idx1ReadNumBean idx1_read_num;
    /**
     * min : 0
     * max : 0
     */

    private Idx2ReadNumBean idx2_read_num;
    /**
     * min : 0
     * max : 0
     */

    private Idx3ReadNumBean idx3_read_num;
    /**
     * min : 0
     * max : 0
     */

    private Idx4ReadNumBean idx4_read_num;
    /**
     * min : 0
     * max : 0
     */

    private Idx5ReadNumBean idx5_read_num;
    /**
     * min : 0
     * max : 0
     */

    private Idx6ReadNumBean idx6_read_num;
    /**
     * min : 0
     * max : 0
     */

    private Idx7ReadNumBean idx7_read_num;
    /**
     * min : 0
     * max : 0
     */

    private Idx8ReadNumBean idx8_read_num;
    private int status;
    private String status_name;
    private String source;
    private String source_name;
    private int is_sync;
    private int last_bring_time;
    private int distance_last_bring_time;
    private int is_have_plan;
    private int is_updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWx_name() {
        return wx_name;
    }

    public void setWx_name(String wx_name) {
        this.wx_name = wx_name;
    }

    public String getWx_id() {
        return wx_id;
    }

    public void setWx_id(String wx_id) {
        this.wx_id = wx_id;
    }

    public String getRaw_id() {
        return raw_id;
    }

    public void setRaw_id(String raw_id) {
        this.raw_id = raw_id;
    }

    public String getQrcode_url() {
        return qrcode_url;
    }

    public void setQrcode_url(String qrcode_url) {
        this.qrcode_url = qrcode_url;
    }

    public String getFans_num() {
        return fans_num;
    }

    public void setFans_num(String fans_num) {
        this.fans_num = fans_num;
    }

    public String getFans_num_int() {
        return fans_num_int;
    }

    public void setFans_num_int(String fans_num_int) {
        this.fans_num_int = fans_num_int;
    }

    public Idx1ReadNumBean getIdx1_read_num() {
        return idx1_read_num;
    }

    public void setIdx1_read_num(Idx1ReadNumBean idx1_read_num) {
        this.idx1_read_num = idx1_read_num;
    }

    public Idx2ReadNumBean getIdx2_read_num() {
        return idx2_read_num;
    }

    public void setIdx2_read_num(Idx2ReadNumBean idx2_read_num) {
        this.idx2_read_num = idx2_read_num;
    }

    public Idx3ReadNumBean getIdx3_read_num() {
        return idx3_read_num;
    }

    public void setIdx3_read_num(Idx3ReadNumBean idx3_read_num) {
        this.idx3_read_num = idx3_read_num;
    }

    public Idx4ReadNumBean getIdx4_read_num() {
        return idx4_read_num;
    }

    public void setIdx4_read_num(Idx4ReadNumBean idx4_read_num) {
        this.idx4_read_num = idx4_read_num;
    }

    public Idx5ReadNumBean getIdx5_read_num() {
        return idx5_read_num;
    }

    public void setIdx5_read_num(Idx5ReadNumBean idx5_read_num) {
        this.idx5_read_num = idx5_read_num;
    }

    public Idx6ReadNumBean getIdx6_read_num() {
        return idx6_read_num;
    }

    public void setIdx6_read_num(Idx6ReadNumBean idx6_read_num) {
        this.idx6_read_num = idx6_read_num;
    }

    public Idx7ReadNumBean getIdx7_read_num() {
        return idx7_read_num;
    }

    public void setIdx7_read_num(Idx7ReadNumBean idx7_read_num) {
        this.idx7_read_num = idx7_read_num;
    }

    public Idx8ReadNumBean getIdx8_read_num() {
        return idx8_read_num;
    }

    public void setIdx8_read_num(Idx8ReadNumBean idx8_read_num) {
        this.idx8_read_num = idx8_read_num;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public int getIs_sync() {
        return is_sync;
    }

    public void setIs_sync(int is_sync) {
        this.is_sync = is_sync;
    }

    public int getLast_bring_time() {
        return last_bring_time;
    }

    public void setLast_bring_time(int last_bring_time) {
        this.last_bring_time = last_bring_time;
    }

    public int getDistance_last_bring_time() {
        return distance_last_bring_time;
    }

    public void setDistance_last_bring_time(int distance_last_bring_time) {
        this.distance_last_bring_time = distance_last_bring_time;
    }

    public int getIs_have_plan() {
        return is_have_plan;
    }

    public void setIs_have_plan(int is_have_plan) {
        this.is_have_plan = is_have_plan;
    }

    public int getIs_updated() {
        return is_updated;
    }

    public void setIs_updated(int is_updated) {
        this.is_updated = is_updated;
    }

    public static class Idx1ReadNumBean {
        private int min;
        private int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }

    public static class Idx2ReadNumBean {
        private int min;
        private int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }

    public static class Idx3ReadNumBean {
        private int min;
        private int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }

    public static class Idx4ReadNumBean {
        private int min;
        private int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }

    public static class Idx5ReadNumBean {
        private int min;
        private int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }

    public static class Idx6ReadNumBean {
        private int min;
        private int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }

    public static class Idx7ReadNumBean {
        private int min;
        private int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }

    public static class Idx8ReadNumBean {
        private int min;
        private int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }
    }
}
