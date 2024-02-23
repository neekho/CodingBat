import re
from urllib.parse import urlparse, parse_qs






def getRequest(valid_auth_tokens, requests) -> list:

    response = list()


    for request in requests:

        

        method = request[0]
        url = request[1]
        domain = url.split('?token=')[0]
        
        request_token = get_request_token(url)

        valid_token = request_token in valid_auth_tokens


        if method == 'GET':

            if valid_token: 


                parsed_url = urlparse(url)
                query_params = parse_qs(parsed_url.query)
                

                
                response.append(f'VALID {", ".join(f"{key}, {value}" for key, value in query_params.items())}')

            else: response.append('INVALID')

        elif method == 'POST' and valid_token and valid_csrf(request_token):
            response.append('VALID')

        else: response.append('INVALID')




    return response

def get_request_token(url) -> str:

    start = url.find('token=')

    end = url.find('&') if '&' in url else len(url)
    
    token = url[start:end].split('token=')[1]

    return token


def valid_csrf(token) -> bool:
    pattern = "^[a-z0-9]+$"
    return bool(re.match(pattern, token))



# RUN

valid_tokens = ['zxcxvvb12', 'afsgerr2c']


requests = [['GET', 'https://www.example.com/?token=afsgerr2c&name=alex&age=22&city=quezon'], 
            ['GET', 'https://www.wikipedia.com/?token=zxfcawsdgear&name=alex'], 
            ['POST', 'https://www.facebook.com/?token=sfhsdvc23&name=nikho&city=makati&age=24'],
            ['POST', 'https://www.facebook.com/?token=zxcxvvb12&name=nikho&city=makati&age=24']
            
            ]


r = getRequest(valid_tokens, requests)


print(r)



