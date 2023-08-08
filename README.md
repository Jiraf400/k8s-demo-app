Wrote a simple app to test communication between pods

was helpful:
1. https://stackoverflow.com/questions/58561682/minikube-with-ingress-example-not-working
2. https://stackoverflow.com/questions/51511547/empty-address-kubernetes-ingress
3. https://kubernetes.io/docs/tasks/access-application-cluster/ingress-minikube/
4. https://cloud.spring.io/spring-cloud-kubernetes/spring-cloud-kubernetes.html
5. https://docs.vmware.com/en/VMware-Spring-Cloud-Gateway-for-Kubernetes/2.0/scg-k8s/GUID-guides-getting-started.html
6. https://stackoverflow.com/questions/71634186/cannot-connect-to-kubernetes-nodeport-service
7. https://stackoverflow.com/questions/43789155/nodeport-service-is-not-externally-accessible-via-port-number
8. https://medium.com/@JockDaRock/minikube-on-windows-10-with-hyper-v-6ef0f4dc158c

# NOTES
> I couldn't access services by their external ip until I changed minikube 
driver from docker to hyperv following by **guide in point 8**