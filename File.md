**NDHB Compliance MVP based on indEA Architecture with CQRS & Event Sourcing**
----------------------------------------------------------------------------------------------------------------------------------------


**NDHB/indEA architecture implemented list**
----------------------------------------------------------------------------------------------------------------------------------------
**1. Open Source Software:** 

Government of India has notified the guidance for adoption of Open Source Software by Government Organizations. In accordance with the same, the organizations shall endeavor to adopt Open Source Software in all e-Governance systems as a preferred option in comparison to Closed Source Software (CSS). 

The Open Source Software shall have the following characteristics:
   * The source code shall be available for the community / adopter / end-user to study and modify the software and to redistribute          copies of either the original or modified software.
   * Source code shall be free from any royalty.
   
**2. Open Application Programming Interfaces (APIs):**

The Application Architecture may use Open APIs to enable quick and transparent integration with other eGovernance applications and systems implemented by various Government organizations, thereby providing access to data & services and promoting citizen/ developer participation for the benefit of the community. 

Specific OEM products may only be used when necessary to achieve scale, performance and reliability. Every such OEM component/service/product/framework/Managed Service Provider pre-existing product or work must be wrapped in a vendor neutral API so that at any time the OEM product can be replaced without affecting rest of the system. In addition, there must be at least 2 independent OEM products available using same standard/API before it can be used to ensure system is not locked in to single vendor implementation. 

**3. Service Discoverability:**

While productizing the existing application or designing a new application for hosting, it is important that accidental creation of redundant services or implementation of redundant logic is avoided. Service discoverability makes this happen by ensuring that metadata attached to a service and describes overall purpose of the service and its functionality, which makes the services easily discoverable. A repository of re-usable business logic components is to be maintained and made available.

**4. Platform & Database Agnostic:**

Applications shall be forward and backward compatible. They shall be deployable on any technology platform and shall be able to communicate with any data store.

**5. Application design for occasionally connected systems:**

For the small percentage of functionality that requires “occasionally connected/offline” operations, applications may be designed to use a local persistent store/cache just for the purposes of offline capability and later synchronize with the host application as and when connectivity is restored. As connectivity becomes ubiquitous, less of such offline capabilities are needed.

**6. Microservices:**

Micro Service Architecture (MSA) allows creation of Services which are loosely coupled, have different programming language base, scalable, quicker delivery time, etc. However, addition of every new Micro Service in the system will consume system resources, require integration with other Microservices and potentially increase system latency. Larger number of Microservices will also increase time required to Test and maintain the services. Therefore, MSA should be adopted after conducting due diligence on its likely impact on the overall performance of the system.
Government services are to be exposed via suitable interfaces that are technology implementation and vendor agnostic. One of the approaches is to follow the Open API specifications (https://openapis.org) and must comply with the “Policy on Open Application Programming Interfaces (APIs) for Government of India”. 

**High level architecture**
----------------------------------------------------------------------------------------------------------------------------------------


**Technology list**
----------------------------------------------------------------------------------------------------------------------------------------


**Design principles/patterns used**
----------------------------------------------------------------------------------------------------------------------------------------

