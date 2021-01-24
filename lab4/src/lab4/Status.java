package lab4;

public enum Status {
	UNKNOW,
	SLEEPING
	{
		@Override
        public String toString() {
            return "is sleeping";
        }
	},
	AWAKE
	{
		@Override
		public String toString() {
            return "is awake";
        }
	}
}
