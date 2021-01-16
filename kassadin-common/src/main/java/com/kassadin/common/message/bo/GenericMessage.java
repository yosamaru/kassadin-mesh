package com.kassadin.common.message.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public abstract class GenericMessage {
    public enum MessageTag {
        HELP_TAG("help.tag", "帮助用户");
        // 成员变量
        private String tag;
        private String describe;
        // 构造方法
        private MessageTag(String tag, String describe) {
            this.tag = tag;
            this.describe = describe;
        }
        // 普通方法
        public static String getTag(String tag) {
            for (MessageTag m : MessageTag.values()) {
                if (m.getTag() == tag) {
                    return m.getTag();
                }
            }
            return null;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }
    }

    private Long messageId;
}
