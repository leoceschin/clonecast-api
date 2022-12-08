# Clonecast API
Uma API de podcast apenas para estudar como fazer upload de arquivos e streaming de audio.

## Funcionamento
Primeiro fazemos o upload do arquivo por meio de um Multipart form com o nome de "file". Obtemos como resposta a url de streaming do arquivo:

| método | endereço |
|--------|----------|
| POST | http://localhost:8080/upload |

```
{
	"message": "http://localhost:8080/audios/wandinhamusictiktok.mp3"
}
```

Colocamos então a url no json de registro
| método | endereço |
|--------|----------|
| POST | http://localhost:8080/podcasts/register |
```
{
	"name": "Wednesday Tik Tok Music",
	"author": "Leona",
	"urlStreamAudio": "http://localhost:8080/audios/wandinhamusictiktok.mp3"
}
```

Assim temos ela salva no nosso banco de dados para servir alguma aplicação.
| método | endereço |
|--------|----------|
| GET | http://localhost:8080/podcasts/all |
```
[
	{
		"id": "4e30d776-8a84-43d4-adce-dac35bcede0d",
		"name": "Wednesday Tik Tok Music",
		"ratio": 0.0,
		"linkStreamAudio": "http://localhost:8080/audios/wandinhamusictiktok.mp3"
	}
]
```


