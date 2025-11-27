<script>
	import Hijo from "./Hijo.svelte"
	export let name
	let nombre = 'Visitante'

	let contador =0;
	function incrementar() {
		contador = contador + 1;
	}

	function Saludar() {
		alert(nombre ? nombre : "no hay nombre")
	}
</script>

<main>
	<h1>Contar: {contador}</h1>
	<button on:click={incrementar}>Sumar ++</button>
	<Hijo texto="Salvar"></Hijo>
	<Hijo texto="Borrar" color="red"></Hijo>
	<input type="text" placeholder="Escribe tu nombre">
	<button>Saludar</button>
	 <h1>hola {nombre}!</h1>
	<p>Visit the <a href="https://svelte.dev/tutorial">Svelte tutorial</a> to </p>
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>