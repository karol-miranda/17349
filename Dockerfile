FROM alpine
RUN apk add nginx 
RUN nginx
CMD ["nginx", "-g", "daemon off;"]
EXPOSE 80
#COPY c:\users\xxx\despliegue /var/lib/nginx/html (corroborar la ruta)
COPY ./despliegue /var/lib/nginx/html
COPY ./karol.conf /etc/nginx/http.d/default.conf