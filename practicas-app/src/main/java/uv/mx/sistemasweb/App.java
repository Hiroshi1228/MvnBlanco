package uv.mx.sistemasweb;

import static spark.Spark.*;

public class App 
{
    public class HelloWorld {
        public static void main(String[] args) {
            get("/aprobado", (req, res) -> "8");
        }
    }
}
