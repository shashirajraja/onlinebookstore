// Octokit.js
// https://github.com/octokit/core.js#readme
const octokit = new Octokit({
  auth: 'YOUR-TOKEN'
})

await octokit.request('POST /repos/{owner}/{repo}/dependency-graph/snapshots', {
  owner: 'OWNER',
  repo: 'REPO',
  version: 0,
  sha: 'ce587453ced02b1526dfb4cb910479d431683101',
  ref: 'refs/heads/main',
  job: {
    correlator: 'yourworkflowname_youractionname',
    id: 'yourrunid'
  },
  detector: {
    name: 'octo-detector',
    version: '0.0.1',
    url: 'https://github.com/octo-org/octo-repo'
  },
  scanned: '2022-06-14T20:25:00Z',
  manifests: {
    'package-lock.json': {
      name: 'package-lock.json',
      file: {
        source_location: 'src/package-lock.json'
      },
      resolved: {
        '@actions/core': {
          package_url: 'pkg:/npm/%40actions/core@1.1.9',
          dependencies: [
            '@actions/http-client'
          ]
        },
        '@actions/http-client': {
          package_url: 'pkg:/npm/%40actions/http-client@1.0.7',
          dependencies: [
            'tunnel'
          ]
        },
        tunnel: {
          package_url: 'pkg:/npm/tunnel@0.0.6'
        }
      }
    }
  },
  headers: {
    'X-GitHub-Api-Version': '2022-11-28'
  }
})
