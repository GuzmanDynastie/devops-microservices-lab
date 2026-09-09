import express from "express";
const app = express();
const PORT = 3000;

app.get("/health", (request, response) => {
    console.log("Health check recibido");

    response.status(200).json({
        status: "UP"
    });
});

app.listen(PORT, () => {
    console.log(`API Gateway escuchando en el puerto ${PORT}`);
});