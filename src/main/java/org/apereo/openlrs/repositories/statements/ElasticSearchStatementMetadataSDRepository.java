/**
 * Copyright 2014 Unicon (R) Licensed under the
 * Educational Community License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package org.apereo.openlrs.repositories.statements;

import org.apereo.openlrs.model.StatementMetadata;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ggilbert
 *
 */
@Repository
@Profile("redisElasticsearch")
public interface ElasticSearchStatementMetadataSDRepository extends ElasticsearchRepository<StatementMetadata, String> {
	Page<StatementMetadata> findByUser(String user, Pageable pageable);
	Page<StatementMetadata> findByContext(String context, Pageable pageable);
	Page<StatementMetadata> findByUserAndContext(String user, String context, Pageable pageable);
}
