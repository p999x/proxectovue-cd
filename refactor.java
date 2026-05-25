methods: {
  aumentarContador() {
    if (this.contador < 10) {
      this.contador = this.contador + 1;
    } else {
      console.log("No puedes pasar de 10");
    }
  },
  
  diminuirContador() {
    if (this.contador > 0) {
      this.contador = this.contador - 1;
    } else {
      console.log("No puedes bajar de 0");
    }
  }
}