package ru.mera.ivstepan.carshowroom.soap.utils;

import org.springframework.stereotype.Component;

@Component
public class OrderStatus {

    public enum Status {
        RECEIVED("RECEIVED"),
        PROCESS("PROCESS"),
        COMPLETED("COMPLETED");

        private String status;

        private Status(String status) {
            this.status = status;
        }

        public String getDescription() {
            return status;
        }
    }

    ;
}
