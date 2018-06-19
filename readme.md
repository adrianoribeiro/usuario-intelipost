## Usuário-Intelipost

### Tecnologias a serem utulizadas:
* Spring Boot (json/restful);
* Plugin do spotify para encapsular o jar em um docker;
* Maven;
* Docker (para disponibilizar o banco de dados);
* Kubernetes (para orquestrar os conteiners);
* Postman;
* Spring security para segurança;
* JWT para geração de token;

(Spring Boot + MongoDB)
- Crud de pessoas

Endpoints:
- Logar no sistema (POST): http://{IP}:{PORT}/login
- Ver informações do usuário (GET): http://{IP}:{PORT}/api/user/{name}
```
{
    "id": 1,
    "dataNascimento": "1982-07-10",
    "nome": "Adriano",
    "perfil": "PREMIUM"
}
```
- Ver atividades do usuário (GET): http://{IP}:{PORT}/api/user/myActivities
```
[
    "Participar do fórum",
    "Baixar revistas",
    "Assistir vídeo aulas"
]
```

### Sugestão para rodar: 

1. Gerar o jar: mvn clean install -U -DskipTests
2. Gerar a imagem: sudo docker:build 
3. Subir no seu repositório: sudo docker push {imagem}
4. Gerar o deployment: kubectl apply -f {arquivo yaml}
5. Caso esteja usando o minikube, crie o LoadBalancer: kubectl expose deployment {deployment} --port {port} --target-port {target-port} --type="LoadBalancer"
