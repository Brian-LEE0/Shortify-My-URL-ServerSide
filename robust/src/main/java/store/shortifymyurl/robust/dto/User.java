package store.shortifymyurl.robust.dto;

import java.util.Date;
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class User {

    @Getter
    public static class UserSignIn {
        @NotNull(message = "이름은 Null 일 수 없습니다!")
        @Size(min = 1, max = 10, message = "이름은 1 ~ 10자 이여야 합니다!")
        private String email;
        @NotNull(message = "이름은 Null 일 수 없습니다!")
        private String pwd;
    }

    @Getter
    public static class UserSignUp {
        @NotNull(message = "이름은 Null 일 수 없습니다!")
        @Schema(example = "id@email.com")
        private String email;
        @NotNull(message = "이름은 Null 일 수 없습니다!")
        private String pwd;
        private String name;
    }

    @Data
    @AllArgsConstructor
    public static class UserInfo {
        private UUID id;
        @Schema(example = "id@email.com")
        private String email;
        private String pwd;
        private String name;
        private int tier;
        private Date expire;

        public static UserInfo fromUserSignUp(UserSignUp usu) {
            return new UserInfo(
                    UUID.randomUUID(),
                    usu.getEmail(),
                    usu.getPwd(),
                    usu.getName(),
                    0,
                    new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000));
        }

        public static UserInfo fromUserSignIn(UserSignIn usi) {
            return new UserInfo(
                    UUID.randomUUID(),
                    usi.getEmail(),
                    usi.getPwd(),
                    "Naver",
                    0,
                    new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000));
        }
    }
}
