package presebnanion;

public enum Oblast {
    YSYK_KOL {
        @Override
        public String ozgocho() {
            return "Ысык-Колу бар!";
        }
    },
    CHUI {
        @Override
        public String ozgocho() {
            return "Буранасы бар!";
        }
    },
    NARYN {
        @Override
        public String ozgocho() {
            return "";
        }
    },
    TALAS {
        @Override
        public String ozgocho() {
            return "Манастын кумбозу бар!";
        }
    },
    OSH {
        @Override
        public String ozgocho() {
            return "Сулайман-Тоосу бар!";
        }
    },
    BATKEN {
        @Override
        public String ozgocho() {
            return "Айгул гулу бар!";
        }
    },
    JALAL_ABAD {
        @Override
        public String ozgocho() {
            return "Сары- Челек бар!";
        }
    };
    public abstract String ozgocho();
}
